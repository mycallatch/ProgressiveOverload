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

-- Inserts for chest workouts
INSERT INTO exercise VALUES(12, 'Push-Ups', 'chest', 'push', 'chest', 'Home');
INSERT INTO exercise VALUES(13, 'Dips', 'chest', 'push', 'chest', 'Home');
INSERT INTO exercise VALUES(14, 'Bench Press', 'chest', 'push', 'chest', 'Gym');
INSERT INTO exercise VALUES(15, 'Incline Bench Press', 'chest', 'push', 'chest', 'Gym');
INSERT INTO exercise VALUES(16, 'Dumbell Pullovers', 'chest', 'push', 'chest', 'Gym');
INSERT INTO exercise VALUES(17, 'Pec Flyes', 'chest', 'push', 'chest', 'Gym');
INSERT INTO exercise VALUES(18, 'Machine Press', 'chest', 'push', 'chest', 'Gym');

-- Inserts for back workouts
INSERT INTO exercise VALUES(19, 'Pull-Ups', 'back', 'pull', 'back', 'Home');
INSERT INTO exercise VALUES(20, 'Barbell Rows', 'back', 'pull', 'back', 'Gym');
INSERT INTO exercise VALUES(21, 'Cable Rows', 'back', 'pull', 'back', 'Gym');
INSERT INTO exercise VALUES(22, 'Lat Pulldowns', 'back', 'pull', 'back', 'Gym');
INSERT INTO exercise VALUES(23, 'Deadlifts', 'back', 'pull', 'back', 'Gym');
INSERT INTO exercise VALUES(24, 'Lat Pulldowns', 'back', 'pull', 'back', 'Gym');

-- Inserts for leg workouts

INSERT INTO exercise VALUES(25, 'Squats', 'legs', 'legs', 'legs', 'Home');
INSERT INTO exercise VALUES(26, 'Weighted Squats', 'legs', 'legs', 'legs', 'Gym');
INSERT INTO exercise VALUES(27, 'Leg Press', 'legs', 'legs', 'legs', 'Home');
INSERT INTO exercise VALUES(28, 'Glute Bridges', 'glutes', 'legs', 'legs', 'Home');
INSERT INTO exercise VALUES(29, 'Weighted Calf Raises', 'calves', 'legs', 'legs', 'Gym');
INSERT INTO exercise VALUES(30, 'Calf Raises', 'calves', 'legs', 'legs', 'Home');
INSERT INTO exercise VALUES(31, 'Leg Extensions', 'quads', 'legs', 'legs', 'Home');
INSERT INTO exercise VALUES(32, 'Leg Curls', 'hamstrings', 'legs', 'legs', 'Home');
