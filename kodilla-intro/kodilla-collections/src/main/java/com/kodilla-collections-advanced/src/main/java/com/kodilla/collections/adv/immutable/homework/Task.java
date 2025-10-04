package com.kodilla.collections.adv.immutable.homework;

import java.util.Objects;

public final class Task {
    private final String title;
    private final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;
        return duration == task.duration && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
