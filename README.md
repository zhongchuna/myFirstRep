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

1.快速截图 win+ shift+ s 
2.快速导包 Ctrl + shift+O
3.快速初始化函数 shift + AlT + s
4.ctrl + 1  查看解决方案
5.ctrl +f +t   快速检索
6.ctrl + t  查看上级父类！
7. CTRL + O   查看类结构图 
8.  F2 重命名文件 
9.ctrl +shift + r  查找文件
10.ctrl + d  删除当前 行
11.alt +shift  + r  eclipse 中给文件改名字快捷键
12.  F3 查看源代码  
13.选中单词ctrl +shift + x     快速从英文小写变成大写   +Y 从大写变成小写