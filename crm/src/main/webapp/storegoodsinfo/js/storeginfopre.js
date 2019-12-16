layui.use('laypage', function(){
  var laypage = layui.laypage;
  laypage.render({
	    elem: 'demo7'
	    ,count: $('#total').val()
	    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
	    ,jump: function(obj){
	      console.log(obj);
	    }
	  });
});

function delCheck(){
	layui.use('layer', function(){
		var layer=layui.layer;
		layer.confirm(
				'您确定要删除该记录？',
				{ icon: 3, title: '提示' },
				function (index) {
					layer.msg("删除成功",{icon:6,time:800});
				    layer.close(index);
				}
		);
	});
};




      

