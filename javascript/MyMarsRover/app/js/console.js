document.addEventListener('DOMContentLoaded', function() {

    var btnAcc = document.getElementById('btnAcceleration');
    var btnRev = document.getElementById('btnReverse');
    var roverPosition = document.getElementById('position');
    var roverSpeed = document.getElementById('speed');
    var roverBody = document.getElementById('marsRover');
    var surface = document.querySelectorAll("spun.surface__text");

    btnAcc.addEventListener('click', function () {
        roverPosition.innerHTML = Number(roverPosition.innerHTML) + Number(roverSpeed.innerHTML);
        roverSpeed.innerHTML *= 2;
        if(roverPosition.innerHTML < 7 && roverPosition.innerHTML > -7){
            surface.forEach(function(item, i, surface) {
                surface[i].innerHTML = i-7;

            });
            roverBody.style.left = 100*roverPosition.innerHTML+20+"px";

        }
        if(roverPosition.innerHTML >= 7 || roverPosition.innerHTML <= -7){
            surface.forEach(function(item, i, surface) {
                        surface[i].innerHTML = i-7 + Number(roverPosition.innerHTML);

                    });
            roverBody.style.left = 20+"px";

        }
    });

    btnRev.addEventListener('click', function () {

        if(roverSpeed.innerHTML > 0){
            roverSpeed.innerHTML = -1;
        }
        else if(roverSpeed.innerHTML < 0){
            roverSpeed.innerHTML = 1;
        }

        if(roverBody.classList.contains("marsrover_scale")){
            roverBody.classList.remove("marsrover_scale");
        }
        else {
            roverBody.classList.add("marsrover_scale");
        }

    });
});
