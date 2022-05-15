var express = require('express');
const fs = require('fs')
const http = require('http')
const port = 4000
var app = express();

app.get("/Airplane-Front-End/flightbooking.html", async (req, res) => {

});

const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    fs.readFile('index.html', function(error , data){
        if (error){
            res.write(404)
            res.write('Error: File Not found')
        }else{
            
        }

    })
    if (req.method === 'GET'){
        

    }

});

server.listen(port, function(error){
    if(error) console.log('Something went wrong', error)
    else{
        console.log('Server is listening on port' + port)
    }  

})