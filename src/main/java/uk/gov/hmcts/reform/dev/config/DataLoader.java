package uk.gov.hmcts.reform.dev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.gov.hmcts.reform.dev.models.Task;
import uk.gov.hmcts.reform.dev.repositories.TaskRepository;

import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
public class DataLoader {

    @Autowired
    private TaskRepository taskRepository;

    @PostConstruct
    public void loadData() {
        taskRepository.save(new Task(null, "Prepare Project Report",
            "Compile and finalize the project report for the client presentation.",
            "PENDING", LocalDateTime.of(2025, 4, 20, 15, 0),
            LocalDateTime.of(2025, 4, 1, 9, 0)));

        taskRepository.save(new Task(null, "Team Meeting",
            "Conduct a team meeting to discuss project milestones and blockers.",
            "IN_PROGRESS", LocalDateTime.of(2025, 4, 18, 10, 0),
            LocalDateTime.of(2025, 4, 10, 11, 0)));

        taskRepository.save(new Task(null, "Code Review",
            "Review the code submitted by the development team and provide feedback.",
            "COMPLETED", LocalDateTime.of(2025, 4, 15, 17, 0),
            LocalDateTime.of(2025, 4, 12, 14, 0)));

        taskRepository.save(new Task(null, "Client Feedback",
            "Gather feedback from the client on the initial project deliverables.",
            "PENDING", LocalDateTime.of(2025, 4, 22, 13, 0),
            LocalDateTime.of(2025, 4, 5, 10, 0)));

        taskRepository.save(new Task(null, "Database Optimization",
            "Optimize the database queries for better performance.",
            "IN_PROGRESS", LocalDateTime.of(2025, 4, 25, 16, 0),
            LocalDateTime.of(2025, 4, 15, 9, 30)));
    }
}