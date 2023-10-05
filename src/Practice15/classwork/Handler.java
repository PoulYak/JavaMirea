package Practice15.classwork;
//Локальные классы
/*
Локальные классы (local classes) определяются в блоке кода
 в программе на языке Джаве. На практике чаще всего объявление
 происходит в методе некоторого другого класса. Хотя объявлять локальный
  класс можно внутри статических и нестатических блоков инициализации.
* */


//Public class Handler {
//    Public void handle(String requestPath){
//        сlass Path{
//            List<String> parts = new ArrayList<String>(); String path = "/";
//            Path(String path) {
//                if (path == null) return;
//                this.path = path;
//                for (String s : path.split("/")) if(s.trim().length() > 0) this.parts.add(s); }
//            int size(){return parts.size();}
//            String get(int i){
//                return i > this.parts.size() – 1 ? null :
//                        this.parts.get(i); }
//            boolean startsWith(String s){ return path.startsWith(s);
//            }
//            118
//        }
//        Path path = new Path(requestPath); if(path.startsWith("/page")){ String pageId = path.get(1);
//... } if(path.startsWith("/post")){
//            categoryId = path.get(1);
//            String postId = path.get(2); ...
//        } ...
//    }}



//Анонимные классы

//Анонимные классы являются важным подспорьем в повседневной
// жизни программистов на языке Джава. Анонимный класс
// (anonymous class) — это локальный класс без имени.
// Классический пример анонимного класса:
//        new Thread(new Runnable() { public void run() {
//        ... }
//        }).start();