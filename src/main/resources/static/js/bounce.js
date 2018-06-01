
var loc, velocity, acceleration;

function setup() {
createCanvas( 400, 400 );
loc = createVector( 100, 100 );
velocity = createVector( 1.5, 2.1 );
acceleration = createVector( 0, 0.2 );
print( loc );
}

function draw() {
    background( 0 );
    loc.add(velocity)
    velocity.add(acceleration)
    if ((loc.x > width) || (loc.x < 0)) {
        velocity.x = velocity.x * -1;
    }
    if ((loc.y > height) || (loc.y < 0)) {
        velocity.y = velocity.y * -1;
        loc.y = height
    }
    stroke(255)
    strokeWeight(2)
    fill(255, 0, 0);
    ellipse(loc.x, loc.y, 48, 48);
    //frameRate(30);
}