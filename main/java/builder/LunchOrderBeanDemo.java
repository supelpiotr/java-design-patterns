package builder;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {

        LunchOrder.Builder lunchBuilder = new LunchOrder.Builder();

        lunchBuilder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");

        LunchOrder lunchOrder = lunchBuilder.build();

//        LunchOrderBean lunchOrderBean =
//                new LunchOrderBean
//                        ("Wheat"
//                        , "Lettuce"
//                        , "Mustard"
//                        , "Ham" );

//        lunchOrderBean.setBread("Wheat");
//        lunchOrderBean.setCondiments("Lettuce");
//        lunchOrderBean.setDressing("Mustard");
//        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }

}
