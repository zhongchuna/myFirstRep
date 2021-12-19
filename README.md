# 私人银行取款机项目 
   var money = 100;
    var total = 3;
    do{
        var handle = prompt("欢迎光临本银行ATM:\n请输入您的操作\n1.存钱;\n2.取钱;\n3.显示余额;\n4.退出\n")
        handle = parseInt(handle)

        if(handle == 1){
            money += parseInt(prompt("请输入您要存入的钱数："))
            alert("余额为" + money)
        }else if(handle == 2){
            money -= parseInt(prompt("请输入您要取钱的钱数："))
            alert("余额为" + money)
        }else if(handle == 3){
            alert("余额为" + money)
        }else if(handle == 4){
            alert("确认要退出吗")
        }else{
            alert("操作有误!您还有" + --total + "机会！！！")
        }
    }while(handle!=4 && total!=0)

