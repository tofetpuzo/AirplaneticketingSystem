const request = require('request');
const searchBy = `${}`

const options = {
    method: 'GET',

    url: 'https://aerodatabox.p.rapidapi.com/flights/number/EW789/2022-05-23',
    // url: 'https://aerodatabox.p.rapidapi.com/flights/number/EW789/2022-05-23',
    headers: {
        'X-RapidAPI-Host': 'aerodatabox.p.rapidapi.com',
        'X-RapidAPI-Key': '',
        useQueryString: true
    }
    https://aerodatabox.p.rapidapi.com/flights/{searchBy}/{searchParam}/dates/{fromLocal}/{toLocal}
};

request(options, function (error, response, body) {
    if (error) throw new Error(error);

    console.log(body);
});