package nl.inf2k.opendata.opendataapp;

/**
 * Created by Falco on 27-2-2015.
 * Sqlite tutorial gevolgd van
 * http://www.vogella.com/tutorials/AndroidSQLite/article.html#databasetutorial
 */
public class Comment {
    private long id;
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return comment;
    }
}
