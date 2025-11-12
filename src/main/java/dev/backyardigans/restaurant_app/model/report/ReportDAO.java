package dev.backyardigans.restaurant_app.model.report;

import dev.backyardigans.restaurant_app.model.user.Waiter;

import java.time.LocalDate;

public interface ReportDAO {
    WaiterReport generateWaiterReport(String waiterId);
    GeneralReport generateGeneralReport(LocalDate date);
}
