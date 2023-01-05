package Game1;

public class paneMap{
    private list head;//用来存放方格信息
    public paneMap(){
        head = new list();
    }
    public void set(long x,long y,Object value){
        list p = head;
        //遍历一遍链表，找出对应的值并修改
        while(true){
            for(int i = 0;i < 16;i++){
                if(p.data[i] != null){
                    if(((pane)p.data[i]).x == x && ((pane)p.data[i]).y == y){
                        //如果找出则赋值并结束
                        p.data[i].data = value;
                        return;
                    }
                }
            }
            if(p.next != null){
                p = p.next;
            }else{
                break;
            }
        }
        //再遍历一遍，找出空位并赋值
        p = head;
        while(true){
            for(int i = 0;i < 16;i++){
                if(((pane)p.data[i]) == null){
                    //如果找出则赋值并结束
                    p.data[i] = new pane(x,y,value);
                    p.data[i].data = value;
                    return;
                }
            }
            if(p.next != null){
                p = p.next;
            }else{
                break;
            }
        }
        //如果没有空位则申请一块新的空间
        p.insert(new list());
        p.next.data[0] = new pane(x,y,value);
    }
    public Object get(long x,long y){
        list p = head;
        //遍历一遍链表，查找对应的值
        while(true){
            for(int i = 0;i < 16;i++){
                if(p.data[i] != null){
                    if(((pane)p.data[i]).x == x && ((pane)p.data[i]).y == y){
                        //如果找出则结束
                        return p.data[i].data;
                    }
                }
            }
            if(p.next != null){
                p = p.next;
            }else{
                break;
            }
        }
        //如果没有找出则返回null
        return null;
    }

    private class pane{
        //位置
        public long x;
        public long y;
        //数据
        public Object data;
        public pane(long x,long y,Object data){
            this.x = x;
            this.y = y;
            this.data = data;
        }
    }

    private class list{
        //数据
        public pane[] data;
        //后元素
        public list next;
        public list(){
        //数据
        this.data = new pane[16];
        //后元素
        next = null;
        }
        public void insert(list add){
            if(this.next == null){
                this.next = add;
            }else{
                list p = this.next;
                this.next = add;
               add.next = p;
            }
        }
        public void delNext(){
            if(this.next == null);
            else{
                this.next = this.next.next;
            }
        }
    }
}
