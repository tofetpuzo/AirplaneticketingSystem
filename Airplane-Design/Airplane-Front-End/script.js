const btn = document.getElementById('btn-flight');

btn.addEventListener('click' , () =>{
    const form = document.getElementById('flight-form');

    if(form.style.display === 'none'){
        // this shows the form
        form.style.display = 'block';
    }else{
        // this hides the form
        form.style.display = 'none';
    }

});


function change_slider_value (){
    var slider = document.getElementById('slider')
    document.getElementById('rangePrimary').innerHTML = parseFloat(slider.value)

}


