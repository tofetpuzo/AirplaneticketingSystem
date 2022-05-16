var express = require('express');
const fs = require('fs')
const http = require('http')
const port = 4000
var app = express();


// app.get("/Airplane-Front-End/flightbooking.html", async (req, res) => {

// });

const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    var filepath = false;
    if (req.url == '/') {
        filepath = '/Users/femitemiola/Documents/airpl/AirplaneticketingSystem/Airplane-Design/Airplane-Front-End/index.html'
        fs.readFile(filepath, function (error, data) {
            if (error) {
                res.writeHead(404)
                res.write('Error: The index file can not be found')
            } else {
                res.write(data)
            }
            res.end()
        })
    } else {
        filepath = '/Users/femitemiola/Documents/airpl/AirplaneticketingSystem/Airplane-Design/Airplane-Front-End/' + req.url
        fs.readFile(filepath, function (error, data) {
            if (error) {
                res.writeHead(404)
                res.write('Error: The flight or accommodation file can not be found')
            } else {
                res.write(data)
            }
            res.end()
        })
    };
});

server.listen(port, function (error) {
    if (error) console.log('Something went wrong', error)
    else {
        console.log('Server is listening on port' + port)
    }
});
