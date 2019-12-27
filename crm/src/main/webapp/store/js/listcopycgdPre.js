function postinfo(cgXqId,cgdId,cpId,cpNumber,cpPrice){
	$.ajax({
		data:{"cgXqId":cgXqId,"cgdId":cgdId,"cpId":cpId,"cpNumber":cpNumber,"cpPrice":cpPrice},
		type:"post",
		url:"storeSinfo/inSinfo.do",
		success:function(data){
			if(data.status==200){
				layer.msg('入库成功！',{icon:6,time:1500});
			}else if(data.status==300){
				layer.msg('入库成功，但商品信息可能部分缺失！',{title:"入库新的商品",icon:0,time:1500});
			}else{
				layer.msg('入库失败，发生未知错误！',{icon:5,time:1500});
			}
			
		},
		error:function(){
			layer.msg('入库失败，发生未知错误！',{icon:5,time:1500});
		}
	});
    setTimeout(function(){window.location.reload();}, 1700 );
}	

function postdata(data){
	layer.open({
		  type: 2,
		  title:'采购单'+data+'的详情',
		  skin: 'layui-layer-demo', //样式类名
		  shadeClose: true, //开启遮罩关闭
		  offset:'10px',
		  area: ['1000px','480px'],
		  content: "storeSinfo/cgdxq.do?cgdId="+data
		});
	
}