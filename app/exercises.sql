CREATE TABLE exercise (
	exercise_id INT,
	exercise_name VARCHAR(20),
	exercise_target VARCHAR(20),
    exercise_goal VARCHAR(20),
    exercise_group VARCHAR(20),
	exercise_location VARCHAR(20),
	PRIMARY KEY (exercise_id)
);

-- Inserts for bicep workouts
INSERT INTO exercise VALUES(1, 'Dumbell Curls', 'biceps', 'pull', 'arms', 'Gym');
INSERT INTO exercise VALUES(2, 'Preacher Curls', 'biceps', 'pull', 'arms', 'Gym');
INSERT INTO exercise VALUES(3, 'Cable Curls', 'biceps', 'pull', 'arms', 'Gym');
INSERT INTO exercise VALUES(4, 'Hammer Curls', 'biceps', 'pull', 'arms', 'Gym');
INSERT INTO exercise VALUES(4, 'Barbell Curls', 'biceps', 'pull', 'arms', 'Gym');