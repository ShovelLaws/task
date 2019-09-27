package com.lxh.service;

import java.security.SecureRandom;
import java.util.Random;

public class RandomService {
    /**
     * 作用：用于发送短信验证码 <br>
     * 使用场景：找回密码
     *
     * @date Created by SPACE on 2018-8-15
     */
        private static final String SYMBOLS = "0123456789"; // 数字

        // 字符串
        // private static final String SYMBOLS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        private static final Random RANDOM = new SecureRandom();

        public static void main(String[] args) {
            System.out.println(getNonce_str());
        }

        /**
         * 获取长度为 6 的随机数字
         * @return 随机数字
         * @date 修改日志：由 space 创建于 2018-8-2 下午2:43:51
         */
        public static String getNonce_str() {

            // 如果需要4位，那 new char[4] 即可，其他位数同理可得
            char[] nonceChars = new char[6];

            for (int index = 0; index < nonceChars.length; ++index) {
                nonceChars[index] = SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
            }

            return new String(nonceChars);
        }

    }
