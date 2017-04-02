# little-project
Little project for fun

To run, sping up a postgres database (I recommend doing this in a docker container). Spin up a new database and add the people table you'll find in the src/resources/sql file. When you run, be sure the inject the postgres url (jdbc:postgresql://host:port/dbname), username and password as environmental variables as they will be picked up in the application.properties file to allow you to connect to your database.

To build the project, ```gradle build```. To run the project, ```gradle -Dspring.datasource.url=your_db_url -Dspring.datasource.username=your_user -Dspring.datasource.password=your_password bootRun```. You'll find other tasks you can run by running ```gradle task```. Depending on your version of gradle, it can be easier to use the wrapper, in which case run ```gradle wrapper```, then ```./gradlew -Dspring.datasource.url=your_db_url -Dspring.datasource.username=your_user -Dspring.datasource.password=your_password bootRun```. The application will most likely spin up on localhost:8080, but watch your console to see where to direct your browser to see your running application.
