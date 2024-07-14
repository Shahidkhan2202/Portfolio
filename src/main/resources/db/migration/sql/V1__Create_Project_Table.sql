
CREATE TABLE IF NOT EXISTS project(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    technology_used VARCHAR(255),
    description TEXT,
    duration DATE
);
