class Solution {
    public int numberOfRounds(String loginTime, String logoutTime) {
        int loginHours = (loginTime.charAt(0) - '0') * 10 + (loginTime.charAt(1) - '0');
        int loginMinutes = (loginTime.charAt(3) - '0') * 10 + (loginTime.charAt(4) - '0');
        int logoutHours = (logoutTime.charAt(0) - '0') * 10 + (logoutTime.charAt(1) - '0');
        int logoutMinutes = (logoutTime.charAt(3) - '0') * 10 + (logoutTime.charAt(4) - '0');
        int loginTotalMinutes = loginHours * 60 + loginMinutes;
        int logoutTotalMinutes = logoutHours * 60 + logoutMinutes;
        int totalGamesInADay = (24 * 60) / 15, totalGamesPlayed; 
        int gamesBeforeLogin = (int) loginTotalMinutes / 15 + 1;
        int gamesBeforeLogout = (int) logoutTotalMinutes / 15;

        if (loginTotalMinutes % 15 == 0) {
            gamesBeforeLogin--;
        }

        if (logoutTotalMinutes <= loginTotalMinutes) {
            gamesBeforeLogout = totalGamesInADay + gamesBeforeLogout; 
        }

        totalGamesPlayed = gamesBeforeLogout - gamesBeforeLogin;

        return (totalGamesPlayed >= 0) ? totalGamesPlayed : 0;
    }
}