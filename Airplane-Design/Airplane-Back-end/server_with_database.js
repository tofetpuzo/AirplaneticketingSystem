var express = require('express');
var app = express();

//This creates a pool for connection
const pool = require("./database")



// this helps to read html file
//var fs = require("fs");
app.get("/listUsers", async function (req, res) {

    // This code is to read data from file
    // fs.readFile("./users.json", "utf8", function (err, data) {
    //     console.log(JSON.parse(data));
    //     res.end(data);
    // });

    try{
        const SQLquery = 'SELECT * FROM users'
        const rows = await pool.query(SQLquery);
        //console.log(JSON.parse(rows));
        // This will help in waiting for further calls
        res.status(200).json(rows);
        // This will end the communication
        //res.status.apply(200).end(rows);
    }catch(error){
        res.status(400).send(error.message);
    }
});

app.get("/:id", async function (req, res) {
    // Write to file
    // fs.readFile("./users.json", "utf8", function (err, data) {
    //     var users = JSON.parse(data);
    //     var user = users["user" + req.params.id];
    //     console.log(user);
    //     res.end(JSON.stringify(user));
    // });
    try{
        const SQLquery = 'SELECT * FROM users where user_id= ?';
        const rows = await pool.query(SQLquery, req.params.id);
        console.log(JSON.parse(rows));
        // This will help in waiting for further calls
        res.status(200).json(rows);
        // This will end the communication
        //res.status.apply(200).end(rows);
    }catch(error){
        res.status(400).send(error.message);
    }


});



app.get("/addUser/:fname/:lname/:uname/:pswd/:profession/:gender", async function (req, res) {

    try{
        const data = [req.params.fname, req.params.lname, req.params.profession, req.params.gender]
        const SQLquery = 'INSERT INTO users(firstname, lastname, profession, gender) VALUES (?, ? , ? , ?)';
        const result = await pool.query(SQLquery, data);
        //console.log(JSON.parse({user_id: result.insertedId}));
        // This will help in waiting for further calls
        //res.status(200).json({user_id: result.insertedId});
        res.status(200).send("Successfully added..Thank you");
        // This will end the communication
        //res.status.apply(200).end(rows);
    }catch(error){
        res.status(400).send(error.message);
    }
    








    // fs.readFile("./users.json", "utf8", function (err, data) {
    //     var users = JSON.parse(data);
    //     var new_id = ++Object.keys(users).length;
    //     // this word was used to ass
    //     key = "user" + new_id;

    //     var user = {
    //         "id": new_id,
    //         "firstname": req.params.fname,
    //         "lastname": req.params.lname,
    //         "profession": req.params.profession,
    //         "gender": req.params.gender

    //     }
    //     // Adding the new user to the users dictationary.
    //     users[key] = user;
    //     fs.writeFile("./users.json", JSON.stringify(users), function (err, res){
    //         console.log("File successfully added");
    //     });
    //     console.log(users);
    //     res.end(JSON.stringify(users));
    // });

});


var server = app.listen(3000, function () {
    var host = server.address().address;
    var port = server.address().port;
    console.log("Server running at http://%s:%s: ", host, port);
});
