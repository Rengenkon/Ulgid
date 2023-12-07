package ru.rengen.Ulgid.telegram.models.accounts;

public class TrustedAdmin extends Moderator{
    public void getApprovesCompany() {
        //хз как реализовать
        //выдавать все компании
        // или делать поиск по названию
        //или сортировка по рейтингу

    }

    public void approveCompany(Long companyID) {

    }

    public void denyCompany(Long approvedCompanyID) {

    }

    public void editApproveCompany(Long companyID) {

    }


    public void addModerator() {
        generateCode();
    }

    protected String generateCode() {
        return null;
    }


}
