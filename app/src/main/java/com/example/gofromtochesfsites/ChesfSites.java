package com.example.gofromtochesfsites;

public enum ChesfSites {
    SE_Cotegipe{
        @Override
        public String getCoordinates() {
            return "-12.79337173,-38.42388106";
        }
    },
    SE_Catu{
        @Override
        public String getCoordinates() {
            return "-12.39990139,-38.36172104";
        }
    },
    SE_Sto_A_Jesus{
        @Override
        public String getCoordinates() {
            return "-12.97418022,-39.22176361";
        }
    },
    SE_Eunapolis{
        @Override
        public String getCoordinates() {
            return "-16.33863833,-39.55118073";
        }
    },
    SE_Bom_Jesus_Lapa{
        @Override
        public String getCoordinates() {
            return "-13.30832806,-43.3523294";
        }
    },
    SE_Senhor_Bonfim{
        @Override
        public String getCoordinates() {
            return "-10.44438855,-40.18750746";
        }
    },
    SE_Juazeiro_II{
        @Override
        public String getCoordinates() {
            return "-9.479513169,-40.47572327";
        }
    },
    SE_Juazeiro_III{
        @Override
        public String getCoordinates() {
            return "-9.486201,-40.508461";
        }
    },
    SE_S_Joao_Piaui{
        @Override
        public String getCoordinates() {
            return "-8.358195881,-42.23148588";
        }
    },
    SE_Eliseu_Martins{
        @Override
        public String getCoordinates() {
            return "-8.098792992,-43.66948402";
        }
    },
    Usina_Boa_Esperanca{
        @Override
        public String getCoordinates() {
            return "-6.750670906,-43.56531892";
        }
    },
    SE_Picos{
        @Override
        public String getCoordinates() {
            return "-7.109425672,-41.41349932";
        }
    },
    SE_Taua_II{
        @Override
        public String getCoordinates() {
            return "-6.002163431,-40.27546895";
        }
    },
    SE_Piripiri{
        @Override
        public String getCoordinates() {
            return "-4.285057644,-41.75592084";
        }
    },
    SE_Tiangua_II{
        @Override
        public String getCoordinates() {
            return "-3.770948,-41.028501";
        }
    },
    SE_Fortaleza_II{
        @Override
        public String getCoordinates() {
            return "-3.830279969,-38.54214426";
        }
    },
    SE_Quixada{
        @Override
        public String getCoordinates() {
            return "-4.954327047,-38.92649844";
        }
    },
    SE_Banabuiu{
        @Override
        public String getCoordinates() {
            return "-5.304321461,-38.91360431";
        }
    },
    SE_Russas_II{
        @Override
        public String getCoordinates() {
            return "-4.947764872,-37.99433899";
        }
    },
    SE_Mossoro_II{
        @Override
        public String getCoordinates() {
            return "-5.152120181,-37.34897071";
        }
    },
    SE_Acu_II{
        @Override
        public String getCoordinates() {
            return "-5.593386814,-36.90558622";
        }
    },
    SE_Paraiso{
        @Override
        public String getCoordinates() {
            return "-6.238224814,-36.00453121";
        }
    },
    SE_Natal_II{
        @Override
        public String getCoordinates() {
            return "-5.808560997,-35.23839366";
        }
    },
    SE_Mussure_II{
        @Override
        public String getCoordinates() {
            return "-7.180847442,-34.89452977";
        }
    },
    SE_Coteminas{
        @Override
        public String getCoordinates() {
            return "-7.279306472,-35.895759";
        }
    },
    SE_Goianinha{
        @Override
        public String getCoordinates() {
            return "-7.586133247,-35.08834904";
        }
    },
    SE_Pau_Ferro{
        @Override
        public String getCoordinates() {
            return "-7.860114528,-35.01956211";
        }
    };

    public abstract String getCoordinates();

}
