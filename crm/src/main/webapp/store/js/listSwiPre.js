layui.use('laypage', function(){
  var laypage = layui.laypage;
  laypage.render({
	    elem: 'swipage'
	    ,count: $('#total').val()
	    ,url:'storeWhinfo/listpageSwi.do'
	    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
	    ,jump: function(obj,first){
	      if(!first){
	    	  var url=obj.pages+":"+obj.limit;
	    	  console.log(url);
	      }
	    }
	  });
});


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
