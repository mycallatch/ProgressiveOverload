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
INSERT INTO exercise VALUES(5, 'Barbell Curls', 'biceps', 'pull', 'arms', 'Gym');

-- Inserts for tricep workouts
INSERT INTO exercise VALUES(6, 'Tricep Extension', 'triceps', 'push', 'arms', 'Gym');
INSERT INTO exercise VALUES(7, 'Tricep Push-Down', 'triceps', 'push', 'arms', 'Gym');
INSERT INTO exercise VALUES(8, 'Skull Crushers', 'triceps', 'push', 'arms', 'Gym');
INSERT INTO exercise VALUES(9, 'Tricep Dips', 'triceps', 'push', 'arms', 'Home');
INSERT INTO exercise VALUES(10, 'Diamond Push-Ups', 'triceps', 'push', 'arms', 'Home');
INSERT INTO exercise VALUES(11, 'Tricep Dumbell Kickbacks', 'triceps', 'push', 'arms', 'Gym');
