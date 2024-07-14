CREATE TABLE IF NOT EXISTS Education (
    id INT PRIMARY KEY AUTO_INCREMENT,
    institution_name VARCHAR(100) NOT NULL,
    degree VARCHAR(50) NOT NULL,
    field_of_study VARCHAR(50),
    graduation_year YEAR,
    GPA DECIMAL(3, 2)
);
