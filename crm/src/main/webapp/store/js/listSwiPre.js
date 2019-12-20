function postinfo(data){
	$.ajax({
		type:'post',
		url:'storeWhinfo/selectInfo.do?whid='+data,
		success:function(data){
			console.log(data);
		},
		errer:function(){
			console.log(data);
		}
	})
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
  
