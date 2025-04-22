class Animal {
        public String sleep() {
            return "Zwierze śpi";
        }

        public String makeNoise() {
            return "Zwierze wydaje dźwięk";
        }

        public String roam() {
            return "Zwierze wędruje";
        }

        class Feline extends Animal {
            @Override
            public String roam() {
                return "Zwierzęta z rodziny kocich się przemieszczają";
            }
        }

        class Canine extends Animal {
            @Override
            public String roam() {
                return "Zwierzęta z rodziny psich się przemieszczają";
            }
        }

        class Lion extends Feline {
            @Override
            public String makeNoise() {
                return "Lew ryczy";
            }
        }

        class Cat extends Feline {
            @Override
            public String makeNoise() {
                return "Kot miauczy";
            }
        }

        class Wolf extends Canine {
            @Override
            public String makeNoise() {
                return "Wilk wyje";
            }
        }

        class Dog extends Canine {
            @Override
            public String makeNoise() {
                return "Pies szczeka";
            }
        }

    }