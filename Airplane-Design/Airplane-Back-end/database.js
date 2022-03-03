const mariadb = require('mariadb');

// Connet the database
const pool = mariadb.createPool({
    host:'localhost',
    port: '3307',
    database: 'testapi',
    user:'root',
    password: '',
    connectionLimit: 5
});

pool.getConnection((err, connection) => {
    if(err){
        if(err.code === 'PROTOCOL_CONNECTION_LOST'){
            console.error('Database Connection Lost');
        }
        if(err.code === 'ER_CON_COUNT_ERROR'){
            console.error('Database has too many connection');
        }
        if(err.code === 'ECONNREFUSED'){
            console.error('Database Connection was refused');
        }
    }
    if(connection)connection.release();
    return;

});
module.exports = pool;
