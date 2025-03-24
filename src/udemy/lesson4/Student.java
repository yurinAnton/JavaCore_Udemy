package udemy.lesson4;

public class Student{
    public Integer idCard;
    public String name;
    public String lastname;
    public Integer studyYear;

    public String getAverageGrade(Double gradeMath, Double gradeEconomy, Double gradeForeignLang) {
        double avarage = (gradeMath + gradeEconomy + gradeForeignLang) / 3;
        return String.format("%.1f", avarage);
    }
    public void setData(Integer newIdCard, String newName, String newLastname, Integer newStudyYear) {
        idCard = newIdCard;
        name = newName;
        lastname = newLastname;
        studyYear = newStudyYear;
    }
}
