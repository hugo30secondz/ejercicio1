create table tarjetas(
	id INT AUTO_INCREMENT PRIMARY KEY,
	passion VARCHAR(400) NOT NULL,
	minsalary INT NOT NULL,
	maxsalary INT NOT NULL,
	minage 	INT NOT NULL,
	maxage INT NOT NULL,
	cards VARCHAR(400) NOT NULL
);