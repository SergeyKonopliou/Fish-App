package by.main;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import by.model.BanDate;
import by.model.CatalogFish;
import by.model.Fish;
import by.model.Region;

public class Helper {

	/**
	 * method for creating a list of fish species
	 */
	public static CatalogFish<?> createCatalogFish() {
		@SuppressWarnings("rawtypes")
		CatalogFish<?> catalog = new CatalogFish();
		Map<String, Fish> fishes = new TreeMap<>();
		
		Fish sig = new Fish();
		sig.setName("Сиг");
		sig.setDescription(
				"Сиг - род промысловых рыб семейства лососевых.  Ценный промысловый вид, численность которого повсеместно сокращается.\r\n"
						+ "Внешний вид - тело серебристое с темной спинкой, плавники могут быть темными, редко черными. Сиг чрезвычайно полиморфный вид,\n"
						+ "в связи с чем какие либо характерные признаки отсутствуют. Часто имеется хорошо выраженная рыльная площадка, высота которой меньше ее ширины.\n"
						+ "Рот занижен, хотя может меняться от типично нижнего до почти конечного. Длина тела в среднем 10 - 15 см.\r\n"
						+ "Образ жизни и питание - Данный вид отличается большим разнообразием экологических форм. Это проходные, речные и озерные сиги, а так же бываю\n"
						+ "прибрежные и глубоководные с разным характером питания - от типичных планктофагов до типичных бентофагов, а иногда и хищничают,\n"
						+ "поедая икру других видов и свою собственную.");
		String[] states = new String[] {"жор","клев","клев","жор","клев","нет клева","нет клева","нет клева","клев","жор","жор","жор",};
		Map<String, String> behavior = setBehavior(states);
		sig.setBehavior(behavior);
		fishes.put(sig.getName(), sig);
		
		Fish carp = new Fish();
		carp.setName("Карп");
		carp.setDescription(
				"Карп - рыба семейства карповых. Является ценной крупной рыбой, а так же объектом разведения в прудах.\n"
				+ "Внешний вид - рыба желто-зеленого или коричневого оттенка, имеет толстое, несильно удлиненное тело, покрытое крупной,\n"
				+ "гладкой, золотистой чешуей. Голова крупная, рот занижен, губы подвижны. На верхней губе имеются две пары хорошо развитых коротких уса.\n"
				+ "Спинной плавник длинный с небольшой выемкой. Анальный плавник короткий. В спинном и анальном плавниках имеется\n"
				+ "по зазубренному колючему лучу. Бока золотистого оттенка, спина темнее. Расцветка может изменяться в зависимости от места обитания\n"
				+ "и возраста конкретной особи.\r\n"
				+ "Образ жизни - живет в озерах, реках, водохранилищах, где заселяет тихие, стоячие или медленно текущие воды с твердым глинистым\n"
				+ "либо заиленным дном. На зиму карп залегает в глубокие ямы, его тело покрывается слизью, прекращает питаться, дыхание замедляется.\n"
				+ "Карп практически пресноводная рыба, но и встречается в устьях рек, входящих в Черное, Азовское, Каспийское моря. \r\n"
				+ "Питание - карп кормится в местах богатых растительной и животной пищей. Лакомством карпа могут быть черви, моллюски,\n"
				+ "рачки, личинки насекомых, личинки комаров, а так же придонные организмы, обитающие в иле и многое другое.\n"
				+ "Карп питается почти без перерыва, в связи с чем расположен к быстрому росту и ожирению.");
		String[] states1 = new String[] {"клева нет","клева нет","клева нет","слабый клев","клев","жор","жор","жор","клев","слабый клев","клева нет","клева нет",};
		Map<String, String> behavior1 = setBehavior(states1);
		carp.setBehavior(behavior1);
		fishes.put(carp.getName(), carp);
		
		
		Fish pike = new Fish();
		pike.setName("Щука");
		pike.setDescription(
				"Щука - рыба семейства щуковых. Щука один из основных промысловых видов и желанная добыча любого рыболова.\r\n"
				+ "Внешний вид - тело удлиненное, стреловидное, с боков слегка сжатое. Голова довольно крупная и вытянутая.\n"
				+ "Большой рот занимает половину длины головы, нижняя челюсть выпадает вперед. Имеет большое количество сильных острых зубов.\n"
				+ "Окрас тела очень изменчив в зависимости от среды обитания. Как правило, на буром фоне расположены серо - зеленые\n"
				+ "или белые полосы, иногда разбиты на отдельные пятна. Щука достигает 1,5 метра в длину и 35 кг веса.\r\n"
				+ "Образ жизни - в водоеме щука в основном держится в зарослях водной растительности.\n"
				+ "В данном случае она держится неподвижно и затаившись, но при виде добычи бросается внезапно. В реках постоянно обитает\n"
				+ "в прибрежной зарослевой зоне, а в крупных озерах и водохранилищах - после достижения половой зрелости и длины 50 см уходит\n"
				+ "в центральную часть озер.\r\n"
				+ "Питание - ведет исключительно хищный образ жизни. Молодь в первые месяцы жизни питается зоопланктоном,\n"
				+ "а по достижении длины 4 см переходит на питание молодью рыб, преимущественно карповых и окуневых. Взрослая щука\n"
				+ "потребляет массовых рыб - плотву, окуня, корюшку и других. Для щуки характерен каннибализм: около 25% ее рациона\n"
				+ "составляют более мелкие особи ее собственного вида. Помимо этого, щуки питаются земноводными и рептилиями, крупными\n"
				+ "насекомыми и различными отбросами. Их добычей могут стать и мелкие млекопитающие, например, мыши или кроты, попавшие в воду.\n"
				+ "Щука охотится и на мелких водоплавающих птиц и их птенцов. Этот хищник нападает на животных, достигающих 1/3 от его\n"
				+ "собственных размеров.");
		String[] states2 = new String[] {"слабый клев","клев","жор","жор","жор","клев","клев","клев","клев","жор","жор","слабый клев",};
		Map<String, String> behavior2 = setBehavior(states2);
		pike.setBehavior(behavior2);
		fishes.put(pike.getName(), pike);
		
		Fish perch = new Fish();
		perch.setName("Окунь");
		perch.setDescription(
				"Внешний вид. Тело, сжатое с боков, покрыто мелкой ктеноидной чешуей, щеки целиком в чешуе. Форма тела подлежит значительным\n"
				+ "колебаниям, встречаются окуни с очень высоким телом (сильно горбатые). Крышечная кость имеет один прямой шип,\n"
				+ "предкрышка сзади зазубрена. Межчелюстные кости выдвижные. Щетинковидные зубы расположены полосами во много рядов на челюстях,\n"
				+ "сошнике, нёбных и внешнекрыловидных костях. Клыков нет. Жаберные перепонки не сращены между собой.\r\n"
				+ "Окраска зеленовато-желтая, на боках 5-9 поперечных черных полос. Цвет значительно меняется, в зависимости от цвета грунта;\n"
				+ "кроме того в период размножения цвета половозрелых экземпляров отличаются большей яркостью цветов (брачный наряд).\n"
				+ "Самка от самца по цвету не отличается.\r\n"
				+ "Первый спинной плавник серый, на его конце черное пятно; второй спинной — зеленовато-желтый, грудные плавники — желтые,\n"
				+ "иногда красные. Два спинных плавника соприкасаются или слегка раздвинуты, причем первый спинной выше второго.\r\n"
				+ "Максимальный возраст 17 лет, длина — 51 см и вес — 4,8 кг. Обычно в промысловых уловах преобладают особи длиной до 30 см,\n"
				+ "в среднем 15-20 см и весом 200-300 г в возрасте 4-6 лет.\r\n"
				+ "Образ жизни. Окунь — озерно-речной вид, приспособленный к жизни в прибрежной зарослевой зоне водоема.\n"
				+ "В крупных озерах и водохранилищах с богатой и разнообразной кормовой базой и обилием подходящих для него биотопов окунь\n"
				+ "образует 2 или 3 экологических формы (расы), различающиеся местом обитания, составом пищи и темпом роста.\r\n"
				+ "Питание. Окунь питается зоопланктоном, бентосными организмами и молодью разных видов рыб, которые сменяют друг друга\n"
				+ "в рационе по мере его роста. В разных водоемах пища окуня значительно различается, в связи с составом кормовой базы.\n"
				+ "В некоторых водоемах окунь в течение всей жизни потребляет зоопланктон, или остается бентофагов, не переходя на хищничество."
				+ "собственных размеров.");
		String[] states3 = new String[] {"клев","клев","клев","клев","клев","клев","клев","клев","клев","клев","клев","клев",};
		Map<String, String> behavior3 = setBehavior(states3);
		perch.setBehavior(behavior3);
		fishes.put(perch.getName(), perch);
		
		Fish crucianCarp = new Fish();
		crucianCarp.setName("Карась");
		crucianCarp.setDescription(
				"Внешний вид. Тело короткое, высокое, сжатое с боков, покрытое золотистого оттенка чешуей. Рот конечный, без усиков.\n"
				+ "Брюшина обычно не пигментирована. Спинной плавник длинный, глоточные зубы однорядные. Последние неветвистые лучи\n"
				+ "спинного и анального плавников в виде колючки, по заднему краю с мелкими зазубринами. Рыба средних размеров.\n"
				+ "Живет до 10-12 лет. Достигает длины 50 см и массы 5 кг (Верхняя Волга), но обычные размеры в уловах 9-24 см\n"
				+ "и масса до 600 г. Отмечают высокотелую и низкотелую формы в зависимости от кормности водоема.\r\n"
				+ "Образ жизни. Карась обитает в хорошо прогреваемых водоемах со стоячей водой и мягким дном; в реках он редок,\n"
				+ "держится на участках с замедленным течением. В проточных озерах и в прудах встречается редко. Предпочитает заросшие участки.\n"
				+ "Встречается в старых речных протоках, тихих заводях, глубоких ямах и затопленных карьерах, в прудах.\n"
				+ "Более неприхотлив к дефициту кислорода, чем серебряный карась, поэтому может жить в заболоченных водоемах,\n"
				+ "которые хорошо прогреваются летом и промерзают до дна зимой. Большей частью держится у дна. Хорошо переносит промерзание\n"
				+ "и временное пересыхание водоемов, зарываясь глубоко в ил.\r\n"
				+ "Питание. Питается личинками хирономид (мотыль) и других насекомых, мелкими моллюсками, червями, водорослями, детритом.\n"
				+ "При неблагоприятных условиях часто мельчает, вырождается, образуя низкорослую карликовую форму");
		String[] states4 = new String[] {"клева нет","клева нет","клева нет","слабый клев","клев","жор","жор","жор","клев","слабый клев","клева нет","клева нет",};
		Map<String, String> behavior4 = setBehavior(states4);
		crucianCarp.setBehavior(behavior4);
		fishes.put(crucianCarp.getName(), crucianCarp);
		
		
		
	
		catalog.setFishes(fishes);
		return catalog;

	}
	
	
	/**
	 * method for creating a list of fish behavior by month
	 */
	private static Map<String, String> setBehavior(String[] states){
		Map<String, String> behavior = new LinkedHashMap<>();
		behavior.put(MonthName.ЯНВАРЬ.toString(), states[0]);
		behavior.put(MonthName.ФЕВРАЛЬ.toString(), states[1]);
		behavior.put(MonthName.МАРТ.toString(), states[2]);
		behavior.put(MonthName.АПРЕЛЬ.toString(), states[3]);
		behavior.put(MonthName.МАЙ.toString(), states[4]);
		behavior.put(MonthName.ИЮНЬ.toString(), states[5]);
		behavior.put(MonthName.ИЮЛЬ.toString(), states[6]);
		behavior.put(MonthName.АВГУСТ.toString(), states[7]);
		behavior.put(MonthName.СЕНТЯБРЬ.toString(), states[8]);
		behavior.put(MonthName.ОКТЯБРЬ.toString(), states[9]);
		behavior.put(MonthName.НОЯБРЬ.toString(), states[10]);
		behavior.put(MonthName.ДЕКАБРЬ.toString(), states[11]);
		return behavior;
		
	}
	
	/**
	 * method for creating a list of areas m dates of no fishing
	 */
	public static List<Region> createListRegion() {
		List<Region> regions = new LinkedList<>();
		Region mogilev = new Region();
		mogilev.setName("Могилевская обл.");		
		BanDate dateM1 = new BanDate(1, 4, 30, 5,"Лов всех видов рыб");		
		BanDate dateM2 = new BanDate(1, 3, 15, 4,"Лов щуки обыкновенной ");		
		BanDate dateM3 = new BanDate(15, 4, 30, 5,"Лов судака ");		
		BanDate dateM4 = new BanDate(31, 5, 1, 7,"Лов сома обыкновенного ");		
		BanDate dateM5 = new BanDate(1, 11, 31, 3,"Лов сома обыкновенного ");		
		BanDate dateM6 = new BanDate(1, 11, 15, 12,"Лов сига чудского");		
		BanDate dateM7 = new BanDate(25, 12, 28, 2,"Лов налима обыкновенного");		
		BanDate dateM8 = new BanDate(25, 12, 28, 2,"Промысловый лов всех видов рыбы на зимовальных ямах");
		mogilev.setDates(createListDate(dateM1,dateM2,dateM3,dateM4,dateM5,dateM6,dateM7,dateM8));
		regions.add(mogilev);
		
		Region brest = new Region();
		brest.setName("Брестская обл.");		
		BanDate dateB1 = new BanDate(20, 3, 18, 5,"Лов всех видов рыб");		
		BanDate dateB2 = new BanDate(1, 3, 15, 4,"Лов щуки обыкновенной ");		
		BanDate dateB3 = new BanDate(15, 4, 30, 5,"Лов судака ");		
		BanDate dateB4 = new BanDate(19, 5, 20, 6,"Лов сома обыкновенного ");		
		BanDate dateB5 = new BanDate(1, 11, 31, 3,"Лов сома обыкновенного ");		
		BanDate dateB6 = new BanDate(1, 11, 15, 12,"Лов сига чудского");		
		BanDate dateB7 = new BanDate(25, 12, 28, 2,"Лов налима обыкновенного");		
		BanDate dateB8 = new BanDate(25, 12, 28, 2,"Промысловый лов всех видов рыбы на зимовальных ямах");
		brest.setDates(createListDate(dateB1,dateB2,dateB3,dateB4,dateB5,dateB6,dateB7,dateB8));
		regions.add(brest);
		
		Region grodno = new Region();
		grodno.setName("Гродненская обл.");		
		BanDate dateG1 = new BanDate(1, 4, 30, 5,"Лов всех видов рыб");		
		BanDate dateG2 = new BanDate(1, 3, 15, 4,"Лов щуки обыкновенной ");		
		BanDate dateG3 = new BanDate(15, 4, 30, 5,"Лов судака ");		
		BanDate dateG4 = new BanDate(31, 5, 1, 7,"Лов сома обыкновенного ");		
		BanDate dateG5 = new BanDate(1, 11, 31, 3,"Лов сома обыкновенного ");		
		BanDate dateG6 = new BanDate(1, 11, 15, 12,"Лов сига чудского");		
		BanDate dateG7 = new BanDate(25, 12, 28, 2,"Лов налима обыкновенного");		
		BanDate dateG8 = new BanDate(25, 12, 28, 2,"Промысловый лов всех видов рыбы на зимовальных ямах");
		grodno.setDates(createListDate(dateG1,dateG2,dateG3,dateG4,dateG5,dateG6,dateG7,dateG8));
		regions.add(grodno);
		
		Region vitebsk = new Region();
		vitebsk.setName("Витебская обл.");		
		BanDate dateV1 = new BanDate(10, 4, 8, 6,"Лов всех видов рыб");		
		BanDate dateV2 = new BanDate(9, 3, 25, 4,"Лов щуки обыкновенной ");		
		BanDate dateV3 = new BanDate(15, 4, 30, 5,"Лов судака ");		
		BanDate dateV4 = new BanDate(31, 5, 1, 7,"Лов сома обыкновенного ");		
		BanDate dateV5 = new BanDate(1, 11, 31, 3,"Лов сома обыкновенного ");		
		BanDate dateV6 = new BanDate(1, 11, 15, 12,"Лов сига чудского");		
		BanDate dateV7 = new BanDate(25, 12, 28, 2,"Лов налима обыкновенного");		
		BanDate dateV8 = new BanDate(25, 12, 28, 2,"Промысловый лов всех видов рыбы на зимовальных ямах");
		vitebsk.setDates(createListDate(dateV1,dateV2,dateV3,dateV4,dateV5,dateV6,dateV7,dateV8));
		regions.add(vitebsk);
		
		Region gomel = new Region();
		gomel.setName("Гомельская обл.");		
		BanDate dateGM1 = new BanDate(20, 3, 18, 5,"Лов всех видов рыб");		
		BanDate dateGM2 = new BanDate(1, 3, 15, 4,"Лов щуки обыкновенной ");		
		BanDate dateGM3 = new BanDate(15, 4, 30, 5,"Лов судака ");		
		BanDate dateGM4 = new BanDate(19, 5, 20, 6,"Лов сома обыкновенного ");		
		BanDate dateGM5 = new BanDate(1, 11, 31, 3,"Лов сома обыкновенного ");		
		BanDate dateGM6 = new BanDate(1, 11, 15, 12,"Лов сига чудского");		
		BanDate dateGM7 = new BanDate(25, 12, 28, 2,"Лов налима обыкновенного");		
		BanDate dateGM8 = new BanDate(25, 12, 28, 2,"Промысловый лов всех видов рыбы на зимовальных ямах");
		gomel.setDates(createListDate(dateGM1,dateGM2,dateGM3,dateGM4,dateGM5,dateGM6,dateGM7,dateGM8));
		regions.add(gomel);
		
		Region minsk = new Region();
		minsk.setName("Минская обл.");		
		BanDate dateMN1 = new BanDate(20, 3, 18, 5,"Лов всех видов рыб");		
		BanDate dateMN2 = new BanDate(1, 3, 15, 4,"Лов щуки обыкновенной ");		
		BanDate dateMN3 = new BanDate(15, 4, 30, 5,"Лов судака ");		
		BanDate dateMN4 = new BanDate(19, 5, 20, 6,"Лов сома обыкновенного ");		
		BanDate dateMN5 = new BanDate(1, 11, 31, 3,"Лов сома обыкновенного ");		
		BanDate dateMN6 = new BanDate(1, 11, 15, 12,"Лов сига чудского");		
		BanDate dateMN7 = new BanDate(25, 12, 28, 2,"Лов налима обыкновенного");		
		BanDate dateMN8 = new BanDate(25, 12, 28, 2,"Промысловый лов всех видов рыбы на зимовальных ямах");
		minsk.setDates(createListDate(dateMN1,dateMN2,dateMN3,dateMN4,dateMN5,dateMN6,dateMN7,dateMN8));
		regions.add(minsk);
		
		return regions;
	}
	
	private static List<BanDate> createListDate(BanDate dateOne,BanDate dateTwo,BanDate dateThree,BanDate dateFour,
			BanDate dateFive,BanDate dateSix,BanDate dateSeven,BanDate dateEight){
		List<BanDate> dates = new LinkedList<>();
		dates.add(dateOne);
		dates.add(dateTwo);
		dates.add(dateThree);
		dates.add(dateFour);
		dates.add(dateFive);
		dates.add(dateSix);
		dates.add(dateSeven);
		dates.add(dateEight);
		return dates;
	}
	
	public static StringBuilder findDate(List<Region> regions,int day,int month) {
		StringBuilder str = new StringBuilder();
		for (Region region : regions) {
			str.append(region.getName()).append("\n");
			for (int i = 0; i < region.getDates().size(); i++) {
				int ms = region.getDates().get(i).getMonthStart();
				int ds = region.getDates().get(i).getDayStart();
				if(month > ms || (month == ms &&  day >= ds) ) {
					int me = region.getDates().get(i).getMonthEnd();
					int de = region.getDates().get(i).getDayEnd();
					if( month < me || (month == me && day <= de)) {
						str.append(region.getDates().get(i)).append("\n");
					}
				}
			}
				
			str.append("--------------------------------------------------------------------").append("\n");
		}
		return str;
	}
		
}
