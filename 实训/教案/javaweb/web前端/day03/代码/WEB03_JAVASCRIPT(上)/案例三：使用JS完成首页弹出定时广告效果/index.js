//页面加载完毕时调用init函数
window.onload=init;
//onload事件只能绑定一次。
//window.onload=adv;

function init()
{
	//启动定时器,时间单位是毫秒
	window.setInterval("changImg()",3000);
	
	//2.设置图片显示的定时操作
	timer = window.setInterval("showAdv()",3000);
	
}

//定义全局变量
var i = 1;
function changImg(){
	i++;
	//获取轮播图片元素
	document.getElementById("adv1_img").src="../img/"+i+".jpg";
	if(i==3)
	{
		i=0;
	}
}


//3.编写显示广告的函数
function showAdv(){
	//通过设置style属性的display的值来显示广告
	document.getElementById("showAdv").style.display="block";
	//4.需要清除显示广告的定时操作
	window.clearInterval(timer);
	
	//5.设置隐藏广告的定时操作
	timer = setInterval("hideAdv()",4000);
}

function hideAdv(){
	//6.通过设置style属性的display的值来显示广告
	document.getElementById("showAdv").style.display="none";
	//7.需要清除显示广告的定时操作
	window.clearInterval(timer);
}