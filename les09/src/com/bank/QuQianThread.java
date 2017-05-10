package com.bank;

/**
 * Created by mac on 2017/4/27.
 */
public class QuQianThread implements Runnable{

    private ZhangHU zhangHU ;
    private int money;
    public QuQianThread(ZhangHU zhangHU,int money){
        this.zhangHU = zhangHU;
        this.money = money;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //同步代码块
        // 相当于将zhangHU对象锁住了。只有执行完代码块，才可以释放对象，其他线程才能拿到这个对象，并将其继续锁住
        //zhangHU对象必须是同一个。
        synchronized (zhangHU){
            if(zhangHU.getNumber()>=money){
                //账户余额够
                zhangHU.setNumber(zhangHU.getNumber()-money);
                System.out.println("取钱成功，取走了"+money+"元，余额是"+zhangHU.getNumber());
            }else{
                System.out.println("余额不足,当前余额"+zhangHU.getNumber()+"差"+(money-zhangHU.getNumber()));
            }
        }


    }
}
