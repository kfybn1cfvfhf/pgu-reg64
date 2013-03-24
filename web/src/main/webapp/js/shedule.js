var eventS = [];	

                function getEvents() {
                	var eventJ = [];
					var startJ;
					var finishJ;
					var status;
					var statusColor;


					var urlJ_1 = "/64/widgets/customLookup/SheduleController/getItems?serial=2&itemsPerPage=30&pageIndex=1&searchText=&optionsMap=%7B%22speciality%22%3A%22";
					var urlJ = urlJ_1 + encodeURIComponent($('#speciality2').attr('value')) + "%22%2C%22hospitalUid%22%3A%22" + encodeURIComponent($('#hospital_id').attr('value')) + "%22%2C%22doctorUid%22%3A%22" + encodeURIComponent($('#fio2').attr('value')) + "%22%7D";


					$.ajax({
						url: urlJ,

						success: function( data ) {
						    //alert(data);
						    //alert(typeof data);
						    //alert(data.slice(0,100));
						    $('#calendar').html(data);
						    
							$.each(data, function (key, val) {
								if(typeof(val) == 'object') {
									$.each(val, function (key2, val2) {
										$.each(val2, function (key3, val3) {
											if(typeof(val3) == 'object') {
											    
												startJ = val3['start'];
												finishJ = val3['finish'];
												status = val3['status'];

												startJ = startJ.toString().substr(0,10) + ' ' + startJ.toString().substr(11,8);
												finishJ = finishJ.toString().substr(0,10) + ' ' + finishJ.toString().substr(11,8);

												if (status == 'free') statusColor = 'blue'; else statusColor = 'gray';
												
												eventJ.push ({
													title: '',
													start: startJ,
													end: finishJ,
													allDay: false,
													className: statusColor
												});

											}
										});
									});
								}	
							});

							eventS = eventJ;

							constructCalendar();


						}
					});
					
                }

                function constructCalendar() {

				    var date = new Date();
					var d = date.getDate();
					var m = date.getMonth();
					var y = date.getFullYear();

					$("#calendar").fullCalendar('destroy');
				    $('#calendar').fullCalendar({
				        // put your options and callbacks here
				        					titleFormat: {
												week: "d MMMM yyyy{ '&#8212;' d MMMM yyyy}"
											},
											columnFormat: {
											    week: 'dddd'
											},
											firstDay : 1,
											defaultView : 'agendaWeek',
											slotMinutes : 15,
											minTime : '7:00',
											maxTime : '20:00',
											timeFormat : 'H:mm',
											axisFormat : 'H:mm',
											allDaySlot : false,
											monthNames : [ 'января', 'февраля', 'марта', 'апреля', 'мая', 'июня', 'июля', 'августа', 'сентября', 'октября', 'ноября', 'декабря' ],
											monthNamesShort : [ 'Янв', 'Фев', 'Март', 'Апр', 'Май', 'Июнь', 'Июль', 'Авг', 'Сен', 'Окт', 'Ноя', 'Дек' ],
											dayNames : [ 'Воскресенье','Понедельник', 'Вторник','Среда', 'Четверг','Пятница', 'Суббота' ],
											dayNamesShort : [ 'Вск', 'Пнд','Втр', 'Срд', 'Чтв', 'Птн','Суб' ],
											timeFormat : 'H(:mm)',

											buttonText : {
												today : 'сегодня',
												month : 'месяц',
												week : 'неделя',
												day : 'день'
											},
												
											events: eventS,

											eventClick : function(calEvent, jsEvent, view) {
												if ($(this).hasClass('blue')) {
													var thisEvent = $(this);
													$('.fc-event-bg').css('opacity','0.3');
													$('.fc-event-bg').css('background-color','white');
													thisEvent.find('.fc-event-bg').css('opacity','0.7');
													thisEvent.find('.fc-event-bg').css('background-color','#FF0000');

													var field = $('#record');
													field.attr('value',
		    											    calEvent.start.getFullYear() + '-' +
		    											    (calEvent.start.getMonth()+1) + '-' +
	                                                        calEvent.start.getDate() + 'T' +
	                                                        calEvent.start.getHours() + ':' +
	                                                        calEvent.start.getMinutes() + ':' +
	                                                        calEvent.start.getSeconds()
	                                                    );
	                                                
	                                                alert ('Вы выбрали время записи на прием к врачу : ' + calEvent.start.getHours() + ':' + calEvent.start.getMinutes());

	                                                jQuery('.red').removeClass('red').addClass('blue');
	                                                thisEvent.removeClass('blue');
													thisEvent.addClass('red');	
													$('.gray').css('border-color','gray').find('a').css('background-color','gray').css('border-color','gray').find('.fc-event-time').css('background-color','gray');
													$('.blue').css('border-color','blue').find('a').css('background-color','blue').css('border-color','blue').find('.fc-event-time').css('background-color','blue');
													$('.red').css('border-color','red').find('a').css('background-color','red').css('border-color','red').find('.fc-event-time').css('background-color','red');
												} else {
													alert ('Данное время уже занято');
												}

											},

											eventRender: function(event, element) {
												$('.gray').css('border-color','gray').find('a').css('background-color','gray').css('border-color','gray').find('.fc-event-time').css('background-color','gray');
												$('.blue').css('border-color','blue').find('a').css('background-color','blue').css('border-color','blue').find('.fc-event-time').css('background-color','blue');


											}

				    })
				}

         