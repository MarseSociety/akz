module com.mycompany.mavenproject3 {

    requires javafx.graphics;
    requires java.persistence;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.naming;


    opens com.mycompany.mavenproject3 to javafx.fxml;
    opens com.mycompany.mavenproject3.db;
    exports com.mycompany.mavenproject3;
    exports com.mycompany.mavenproject3.db;
}
