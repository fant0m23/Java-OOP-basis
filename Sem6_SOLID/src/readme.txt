В проекте Семинара 4 отредактированы классы StudentGroup, TeacherGroup (убран метод add). Классы
StudentGroupService и TeacherGroupService заменены на UserGroupSorter. Интерфейсы StudentView и TeacherView
заменены на IUserView. Отредактирован Main.
Созданы: классы - Group, UserGroupChanger, UserGroupSorter;
         интерфейсы - IGroup, IUserGroupAdder, IUserGroupRemover, ISorterUserGroupByComparable,
                      ISorterUserGroupByCustomComparator.


SRP: классы моделей содержат только поля, конструкторы и геттеры. Метод добавления студента/учителя в группу
     вынесен в класс UserGroupChanger.

OCP: открытость к расширению - реализуя всё новые интерфейсы будут добавляться другие
                               варианты сортировки и методы работы с группой, такие как возможность удаления
                               из StudentGroup/TeacherGroup через интерфейс IUserGroupRemover
     закрытость к изменениям - классы содержат только поля, конструкторы и геттеры. Всё поведение
                               вынесено в интерфейсы и не может быть удалено.

LSP: принцип соблюдается, возможна подстановка дочерних типов вместо User

ISP: добавлены отдельные интерфейсы IUserGroupAdder, IUserGroupRemover, ISorterUserGroupByComparable
     ISorterUserGroupByCustomComparator, выполняющие каждый свою задачу

DIP: введя абстракции Group, IGroup, IUserGroupAdder, IUserGroupRemover появляется возможность гибкого
     расширения. Унаследовавшись от User и реализуя IGroup новые модели получат все методы доступные
     Student и Teacher. Более высокоуровневые классы не зависят от StudentGroup/TeacherGroup, а зависят от
     абстракции IGroup. Обращение одного класса к другому осуществляется не напрямую, а через интерфейс
