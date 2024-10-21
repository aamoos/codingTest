package com.codingTest.harucoading.브론즈2.Day6;

public class korea7 {
    public static void main(String[] args) {
        /**
         *  취약 URL/ 파라미터
         *  https://fd.korea7.co.kr/mp/mapMng/retrieveAreAuto
         *  coodrsX, coodrsY
         */

        /**
         * xml 파일 위치
         * /app/tmax/jeus/docs/fd/WEB-INF/classes/sql/service/mp/mapMng/AreAddrL1Re1v.xml
         * com.korea7.fd.mp.mapMng.dao.AreAddrL1RetvDao.retrieveAreAuto
         */

        /**
         * api 위치
         * /mp/mapMng/selfMapProxyPost
         */

        /**
         * controller 위치
         * http://10.72.10.236:8089/app/ows/OGCServiceController.do
         * 500 error
         */

        String value = "195453.63742704ss";
        if (!value.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("숫자가 아닌 좌표 문자열이 넘어왔습니다.");
        }

        //test
        String test1 = "195453.63742704";
        String test2 = "195453.63742704a";
        String test3 = String.valueOf(195453.63742704);
        System.out.println(test1.matches("-?\\d+(\\.\\d+)?"));
        System.out.println(test2.matches("-?\\d+(\\.\\d+)?"));
        System.out.println(test3.matches("-?\\d+(\\.\\d+)?"));
    }
}
