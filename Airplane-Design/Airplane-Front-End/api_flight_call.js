const request = require('request');

const options = {
    method: 'GET',
    url: 'https://aerodatabox.p.rapidapi.com/flights/number/EW789/2022-05-23',
    headers: {
        'X-RapidAPI-Host': 'aerodatabox.p.rapidapi.com',
        'X-RapidAPI-Key': '985e972acfmshc856f747e805ad5p1bbb5cjsn558a69fc7db0',
        useQueryString: true
    }
};

request(options, function (error, response, body) {
    if (error) throw new Error(error);

    console.log(body);
});