package com.example.demo;

// License

/**
 * A Task contains five properties, all of which must be filled out within
 * the to-do list that is created. A unique id is generated by the data base
 * repository. Type of task, name of task, date of task and the description
 * of the task is to be completed by the user based on their own requirements.
 * All properties do contain some constraints which can be viewed by individual
 * getter and setter methods in this class.
 *
 * @author Wali Morris<walimmorris@gmail.com>
 * @since 09/01/2020
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 3, max = 15)
    private String type;

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    @NotNull
    @Size(min = 8, max = 8)
    private String date;

    @NotNull
    @Size(min = 10, max = 60)
    private String description;

    /**
     * The TaskRepository is required to auto generate unique id values for
     * each task added to the to-do list, it's not the job of the user to
     * store this information. Therefore, setting the unique id manually
     * should never be accessed by any user.
     * @param id : A unique id auto-generated by the TaskRepository.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * This method is used internally by web engine to process TaskRepository
     * data and retrieve data mapped to a unique id.
     * @return : id corresponding to a Task.
     */
    public long getId() {
        return this.id;
    }

    /**
     * Type refers to the type of Task to be scheduled, this is required information
     * from the user. Type of Task should not be blank and should contain no less
     * than three characters and no more than fifteen.
     * @param type : refers to the type of Task to be completed.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return : Type of Task to be completed.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setting the name refers to the name of the Task. This is required from the
     * user, should be no less than three characters and no more than fifteen
     * characters long.
     * @param name : refers to what the user calls a Task.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return : The name of a Task.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets a date is required of the user which refers to when the date should be
     * completed. The date is represented by a String in format 00/00/0000. This
     * format should be exactly eight characters long.
     * @param date : A date refers to when a Task should be completed.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return : date of Task.
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Sets the description of a Task, this is required by the user and must be no
     * less than ten characters and no more than sixty characters long.
     * @param description : describes what is a Task comprised of by the user.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return : a description of a Task.
     */
    public String getDescription() {
        return this.description;
    }
}





