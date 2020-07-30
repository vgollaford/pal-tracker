package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry timeEntry);
    public TimeEntry find(long timeEntryId);

    TimeEntry find(Long id);

    public List<TimeEntry> list() ;
    public TimeEntry update(long timeEntryId, TimeEntry any) ;
    public void delete(long timeEntryId) ;

    TimeEntry update(Long id, TimeEntry timeEntry);

    void delete(Long id);
}
