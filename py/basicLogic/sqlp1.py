import mysql.connector
import psycopg2
mydb= mysql.connector.connect(
    host=""
    user=""
    password=""
    database=""
)
mycursor = mydb.cursor()

mycursor.execute("CREATE DATABASE mydatabse")
mycursor.execute("SHOW DATABASE")
for x in mycursor:
    print(x)

mycursor.execute("CREATE TABLE mytablenmae (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), address VARCHAR(255))")  
mycursor.execute("SHOW TABLES")  
for y  in mycursor:
    print(y)
mycursor= mydb.cursor()
mycursor.execute("ALTER TABLE mytablename ADD COLUMN id2 INT AUTO_INCRIMENT PRIMARY KEY") #PRIMARY KEY CAN ONLY BE ONE SET 
sql ="INSERT INTO mytablename (name, address) VALUES (%S,%S)"
val=("Aditya", "ranchi")
mycursor.execute(sql,val)
sql ="DELETE FROM mytablename WHERE address = 'ranchi'"
mycursor.execute(sql)
mydb.commit()
sql="DROP TABLE customers"
mycursor.execute(sql)