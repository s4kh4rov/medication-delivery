# 12.Моделирование службы доставки лекарств
Необходимо создать компьютерную модель работы службы
доставки, действующей при складе аптечных товаров.
На складе хранятся K различных лекарств (15≤ K ≤ 35), которые можно
заказать по телефону, факсу или электронной почте. Заказанные лекарства
доставляются покупателям М курьерами службы (3≤ М ≤9) в течение
следующего дня. Все лекарства имеют срок годности, и если срок
годности лекарства истекает через месяц, то лекарство уценивается
в два раза. После истечения срока годности соответствующее лекарство
списывается и подлежит вывозу со склада.
Компьютерная система хранит данные о наличии и количестве каждого
лекарства в текущий момент (например, валидол – 137 штук), его дозировке
(обычно в мг), виде (таблетки, суспензия, спрей, мазь и т.п.), сроке годности,
оптовой цене, а также его группе (например, сердечно-сосудистое средство,
антибиотик и т.п.). В системе хранится также информация о
постоянных покупателях – их фамилия, телефон, адрес,
номер дисконтной карты, список регулярно закупаемых лекарств (например,
инсулин) и периодичность такой закупки (например, еженедельно).
В течение каждого рабочего дня система фиксирует поступающие
заказы на лекарства и автоматически формирует на этой
основе список доставки. Заказ включает номер телефона и адрес
покупателя, номер его дисконтной карты (если таковая имеется), а также
перечень заказываемых лекарств (возможно, с уточнением дозировки и вида
лекарства) с указанием нужного количества упаковок. Если требуемое в заказе
лекарство имеется в нужном количестве на складе, то оно включается в
соответствующую покупку, в ином случае выделяется только доступное на
складе количество.
Общая стоимость покупки (выполненного заказа) подсчитывается как
сумма стоимостей всех включенных в нее лекарств, с учетом действующей
розничной наценки на лекарства (например, 25%) и с учетом
возможной скидки по дисконтной карте (например,
5% от стоимости покупки). При отсутствии дисконтной карты в случае
стоимости покупки выше 1 тыс. рублей дается
скидка в 3%.
В определенные дни в список доставки включаются также плановые
закупки постоянных покупателей – согласно хранящейся о них информации.
Постоянным покупателям дополнительно дается скидка в 5%, но при этом общий
процент скидки для одного покупателя не может превышать 9%.
Сформированный список доставки распределяется между курьерами службы
таким образом, чтобы каждый курьер выполнял доставку не менее 7 и не более
15 заказов (покупок) в день.
Компьютерная система отслеживает текущее количество каждого
лекарства на складе, и если какого-то лекарства (его вида и/или дозировки)
становится меньше определенного количества, то составляет заявку в
фармацевтическую фирму на завоз в аптечный склад
нужного количества этого лекарства, заявки выполняются несколько дней.
Цель моделирования работы службы доставки лекарств – определение
оптимального соотношения процентов розничной наценки и скидок, а также
минимально необходимого числа курьеров. Период моделирования – N дней (10≤
N ≤25), шаг моделирования – один день.
Поток поступающих заказов на лекарства следует моделировать
статистически: все составляющие каждого заказа определяются случайным
образом. Плотность потока заказов зависит от величины розничной наценки, а
вероятность заказа уцененных лекарств выше, чем неуцененных. Завоз лекарств
на аптечный склад по заявке на фармацевтическую фирму моделируется с
помощью случайной величины из диапазона от 1 до 3 – числа дней выполнения
заявки (от даты заявки).
В параметры моделирования работы службы доставки следует включить
числа N, М, K, начальный набор лекарств на складе, проценты скидок и наценки.
В ходе моделирования должны быть доступны сведения о наличии лекарств на
аптечном складе и о выполненных заказах, а по окончании моделирования
следует дополнительно показать общую прибыль склада, его потери за счет
списания лекарств и данные о загрузке курьеров.
