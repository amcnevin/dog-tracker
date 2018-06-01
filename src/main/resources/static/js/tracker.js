var floorplan

function setup() {
    createCanvas( 400, 400 );
    getFloorPlan()
}

function drawFloorPlan(fp) {
    if (fp != null) {
        beginShape();
        for(var i = 0; i < fp.coordList.length; i++) {
             var coord = fp.coordList[i]
             vertex(coord.x, coord.y)
        }
        endShape(CLOSE);
    }
}

function getFloorPlan() {
    fetch('http://localhost:8080/floorplan')
    .then(function(response) {
        return response.json();
    })
    .then(function(output) {
        floorplan = output
    });
}



function draw() {
    background( 0 );
    drawFloorPlan(floorplan)
}

