package com.cgt.vo;



public enum ResCode {
    SUCCESS{
        @Override
        public String code() {
            return "0";
        }

        @Override
        public String msg() {
            return "success";
        }
    },
    ERR{
        @Override
        public String code() {
            return "999";
        }
        @Override
        public String msg() {
            return "error";
        }
    },
    NotReadMessage{
        @Override
        public String code() {
            return "901";
        }
        @Override
        public String msg() {
            return "有未读站内信";
        }
    },
    HAVE{
        @Override
        public String code() {
            return "666";
        }
        @Override
        public String msg() {
            return "请选择其他资产名称";
        }
    },
    NOLOGIN{
        @Override
        public String code() {
            return "999";
        }
        @Override
        public String msg() {
            return "请登录";
        }
    };
    public abstract String code();
    public abstract String msg();
}
