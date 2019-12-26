function postinfo(data){
	if(data==null||data==""){
		layer.msg('请输入订单号后再查询！',{icon:5,time:1500}); 
		return;
	}
	layer.open({
		  type: 2,
		  title:'查询到订单号为'+data+'的订单',
		  skin: 'layui-layer-demo', //样式类名
		  shadeClose: true, //开启遮罩关闭
		  offset:'10px',
		  area: ['800px','550px'],
		  content: "storeSout/selectInfo.do?sid="+data
		});
}	
	
function postUpdate(data){
	console.log(window.location.href);
	var url="storeWhinfo/selectSwi.do?whid="+data;
	parent.location.href=url;
}

function postSinfo(data){
	layer.open({
		  type: 2,
		  title:'订单'+data+'的详情',
		  skin: 'layui-layer-demo', //样式类名
		  shadeClose: true, //开启遮罩关闭
		  offset:'10px',
		  area: ['1000px','550px'],
		  content: "storeSout/listpageSinfo.do?sid="+data
		});
	
}


function delCheck(whid){
	$.ajax({
		type:'post',
		data:{"whid":whid},
		url:'storeWhinfo/delSwi.do',
		success:function(res){
			layer.msg('删除成功！', {icon: 1,time:1000});
			setTimeout(function(){layer.load(1);},1000);
			setTimeout(function(){window.location.reload();},1500);
		}
	})
}
  
