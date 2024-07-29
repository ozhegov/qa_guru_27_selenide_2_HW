# Автоматизированное тестирование с использованием фреймворка Selenide <img src="https://github.com/ozhegov/universe_data_ui_tests/blob/main/images/logo/Selenide.svg" width="30" height="30" alt="Selenide"/>

## <a>**Задача:**</a>
1. Разработать следующий автотест:
 - На главной странице [GitHub](https://github.com/)  перейти в Меню -> Solutions -> Enterprize (с помощью команды **hover** для Solutions)
 - Убедиться, что загрузилась нужная страница (например, что заголовок: *"The AI-powered developer platform."*)

2. Разработать следующий автотест на Drag&Drop:
 - Открыть [страницу](https://the-internet.herokuapp.com/drag_and_drop)
 - Перенести прямоугольник А на место В (с помощью **Selenide.actions()**)
 - Проверить, что прямоугольники действительно поменялись
