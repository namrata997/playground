var canvas = document.getElementById("canvas"),
    ctx = canvas.getContext("2d");

canvas.width = 934;
canvas.height = 622;


var background = new Image();
background.src = "http://i.imgur.com/yf6d9SX.jpg";

background.onload = function(){
    ctx.drawImage(background,0,0);   
}