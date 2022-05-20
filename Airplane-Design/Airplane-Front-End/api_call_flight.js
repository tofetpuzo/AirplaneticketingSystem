const searchBy = 'EW789'
const date_flight = '2022-05-23'
const request = require('request');

function api_call() {
    const options = {
        method: 'GET',

        url: `https://aerodatabox.p.rapidapi.com/flights/number/${searchBy}/${date_flight}`,
        // url: 'https://aerodatabox.p.rapidapi.com/flights/number/EW789/2022-05-23',
        headers: {
            'X-RapidAPI-Host': 'aerodatabox.p.rapidapi.com',
            'X-RapidAPI-Key': '985e972acfmshc856f747e805ad5p1bbb5cjsn558a69fc7db0',
            useQueryString: true
        }
        // https://aerodatabox.p.rapidapi.com/flights/{searchBy}/{searchParam}/dates/{fromLocal}/{toLocal}
    };


    request(options, function (error, response, body) {
        if (error) throw new Error(error);  

            var obj = JSON.parse(body, function(key, value){
                
                console.log(key, value)
                // if (key === "airport"){
                //     // console.log(value)
                // }
            });     
            var obj = JSON.parse(body)
            console.log(obj[0].departure);

            // console.log(body)

            // console.log(Object.keys(obj[0].length))

    });
}
api_call()
