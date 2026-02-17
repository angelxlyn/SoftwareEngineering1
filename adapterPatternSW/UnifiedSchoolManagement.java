package adapterPatternSW;

public class UnifiedSchoolManagement {
    public static void main(String[] args){
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);
        
        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp gradingSystemAdapter = new GradingSystemAdapter(gradingSystem);
        
        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp librarySystemAdapter = new LibrarySystemAdapter(librarySystem);
        
        System.out.println(attendanceSystemAdapter.integrateSystem());
        System.out.println(gradingSystemAdapter.integrateSystem());
        System.out.println(librarySystemAdapter.integrateSystem());
    }
}