var express = require('express');
var app = express();
//This creates a pool for connection
const pool = require("./database")
// querystring helps you to get information from the data passed like firstname
const { parse } = require('querystring')
const bcrypt = require('bcrypt');

// They are used to process request from parameters of the body
app.use(express.urlencoded());
app.use(express.json());

var fs = require("fs");
app.get("/login", function (req, res) {

    // This code is to read data from file
    fs.readFile("./login.html", "utf8", function (err, data) {
        res.writeHead(200, { 'Content-Type': 'text/html' })
        res.end(data);
    });

});

app.post("/auth", async function (req, res) {
    var is_valid = false;
    try {
        //await collectRequestData(req, result => {
        const { uname, pswd } = req.body;
        const SQLquery = 'select * from users where username=? ';
        const rows = await pool.query(SQLquery, uname);
        if (rows) {
            is_valid = await bcrypt.compare(pswd, rows[0].password)
        }
        //console.log(JSON.parse({user_id: result.insertedId}));
        // This will help in waiting for further calls
        //res.status(200).json({user_id: result.insertedId});
        if (is_valid) {
            // This code is to read data from file
            fs.readFile("./success.html", "utf8", function (err, data) {
                res.writeHead(200, {'Content-Type': 'text/html' }) 
                console.log("valid");            
                //res.status(200).send(is_valid);
                res.end(data);
            });

        } else {
            // This code is to read data from file
            fs.readFile("./login.html", "utf8", function (err, data) {
                res.writeHead(200, { 'Content-Type': 'text/html' })
                console.log("not valid");  
                res.end(data);
            });
        }
       
        // This will end the communication
        //res.status.apply(200).end(rows);

        //});

    } catch (error) {
        res.status(400).send(error.message);
    }


});



app.get("/reg", function (req, res) {

    // This code is to read data from file
    fs.readFile("./reg_form.html", "utf8", function (err, data) {
        res.writeHead(200, { 'Content-Type': 'text/html' })
        res.end(data);
    });

});


// this helps to read html file


app.get("/listUsers", async function (req, res) {

    // This code is to read data from file
    // fs.readFile("./users.json", "utf8", function (err, data) {
    //     console.log(JSON.parse(data));
    //     res.end(data);
    // });

    try {
        const SQLquery = 'SELECT * FROM users'
        const rows = await pool.query(SQLquery);

        //console.log(JSON.parse(rows)), ;
        // This will help in waiting for further calls
        res.status(200).json(rows);
        // This will end the communication
        //res.status.apply(200).end(rows);
    } catch (error) {
        res.status(400).send(error.message);
    }
});

app.get("/:id", async function (req, res) {
    // Write to file
    // fs.readFile("./users.json", "utf8", function (err, data) {
    //     var users = JSON.parse(data);
    //     var user = users["user" + data.id];
    //     console.log(user);
    //     res.end(JSON.stringify(user));
    // });
    try {
        const SQLquery = 'SELECT * FROM users where user_id= ?';
        const rows = await pool.query(SQLquery, req.params.id);
        const encrypt_password = await bcrypt.hash(rows[0].password, 10);
        console.log(encrypt_password);
        //console.log(JSON.parse(rows));
        // This will help in waiting for further calls
        res.status(200).json(rows);
        // This will end the communication
        //res.status.apply(200).end(rows);
    } catch (error) {
        res.status(400).send(error.message);
    }


});



app.get("/addUser/:fname/:lname/:uname/:pswd/:profession/:gender", async function (req, res) {

    try {

        const data = [data.fname, data.lname, data.profession, data.gender]
        const SQLquery = 'INSERT INTO users(firstname, lastname, profession, gender) VALUES (?, ? , ? , ?)';
        const result = await pool.query(SQLquery, data);
        //console.log(JSON.parse({user_id: result.insertedId}));
        // This will help in waiting for further calls
        //res.status(200).json({user_id: result.insertedId});
        res.status(200).send("Successfully added..Thank you");
        // This will end the communication
        //res.status.apply(200).end(rows);
    } catch (error) {
        res.status(400).send(error.message);
    }

});

// the function in req and res takes care of the request from the reg form,.
app.post("/addUser", async function (req, res) {

    try {
        await collectRequestData(req, data => {
            console.log(data);
            const data_info = [data.fname, data.lname, data.uname, data.pswd, data.profession, data.gender]
            const SQLquery = 'INSERT INTO users(firstname, lastname, uname , pswd, profession, gender) VALUES (?, ? , ?. ?, ? , ?)';
            const result = pool.query(SQLquery, data_info);

            //console.log(JSON.parse({ user_id: result.insertedId }));
            //This will help in waiting for further calls
            //res.status(200).json({ user_id: result.insertedId });
            res.status(200).send("Successfully added..Thank you");
            // This will end the communication
            //res.status.apply(200).end(rows);
        });

    } catch (error) {
        res.status(400).send(error.message);
    }


});


async function collectRequestData(request, callback) {
    const FORM_URLENCODED = 'application/x-www-form-urlencoded';
    if (request.headers['content-type'] === FORM_URLENCODED) {
        let body = '';
        request.on('data', chunk => {
            body += chunk.toString();
        });
        request.on('end', () => {
            callback(parse(body));
        });
    }
    else {
        callback(null);
    }
}





var server = app.listen(3000, function () {
    var host = server.address().address;
    var port = server.address().port;
    console.log("Server running at http://%s:%s: ", host, port);
});





    // fs.readFile("./users.json", "utf8", function (err, data) {
    //     var users = JSON.parse(data);
    //     var new_id = ++Object.keys(users).length;
    //     // this word was used to ass
    //     key = "user" + new_id;

    //     var user = {
    //         "id": new_id,
    //         "firstname": data.fname,
    //         "lastname": data.lname,
    //         "profession": data.profession,
    //         "gender": data.gender

    //     }
    //     // Adding the new user to the users dictationary.
    //     users[key] = user;
    //     fs.writeFile("./users.json", JSON.stringify(users), function (err, res){
    //         console.log("File successfully added");
    //     });
    //     console.log(users);
    //     res.end(JSON.stringify(users));
    // });

    // fs.readFile("./users.json", "utf8", function (err, data) {
    //     var users = JSON.parse(data);
    //     var new_id = ++Object.keys(users).length;
    //     // this word was used to ass
    //     key = "user" + new_id;

    //     var user = {
    //         "id": new_id,
    //         "firstname": data.fname,
    //         "lastname": data.lname,
    //         "profession": data.profession,
    //         "gender": data.gender

    //     }
    //     // Adding the new user to the users dictationary.
    //     users[key] = user;
    //     fs.writeFile("./users.json", JSON.stringify(users), function (err, res){
    //         console.log("File successfully added");
    //     });
    //     console.log(users);
    //     res.end(JSON.stringify(users));
    // });
    // fs.readFile("./users.json", "utf8", function (err, data) {
    //     var users = JSON.parse(data);
    //     var new_id = ++Object.keys(users).length;
    //     // this word was used to ass
    //     key = "user" + new_id;

    //     var user = {
    //         "id": new_id,
    //         "firstname": data.fname,
    //         "lastname": data.lname,
    //         "profession": data.profession,
    //         "gender": data.gender

    //     }
    //     // Adding the new user to the users dictationary.
    //     users[key] = user;
    //     fs.writeFile("./users.json", JSON.stringify(users), function (err, res){
    //         console.log("File successfully added");
    //     });
    //     console.log(users);
    //     res.end(JSON.stringify(users));
    // });

