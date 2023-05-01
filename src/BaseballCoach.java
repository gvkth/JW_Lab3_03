public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    //define a private field for the dependency
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getEmailAddress() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }
}
