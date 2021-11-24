# coding: utf-8
import copy

(N, M) = [int(s) for s in input().rstrip().split(" ")]
map_list = []
step_map_list = [[None for j in range(N)] for i in range(M)]
s_place = {}
g_place = {}
for i in range(M):
	l = input().rstrip().split(" ")
	if "s" in l:
		s_place = {
			"x": l.index("s"),
			"y": i
		}
	if "g" in l:
		g_place = {
			"x": l.index("g"),
			"y": i
		}
	map_list.append(l)

def get_position_info(x, y):
	if (x > N-1) or (x < 0) or (y > M-1) or (y < 0):
		return "1"
	return map_list[y][x]
def update_step_map_list(position):
	if step_map_list[position["y"]][position["x"]] == None:
		step_map_list[position["y"]][position["x"]] = position["count"]
	elif step_map_list[position["y"]][position["x"]] > position["count"]:
		step_map_list[position["y"]][position["x"]] = position["count"]
def check_move_right(now_position):
	next_step = True
	new_position = {
		"x": now_position["x"],
		"y": now_position["y"],
		"count": now_position["count"],
	}
	while next_step:
		if get_position_info(new_position["x"] + 1, new_position["y"]) == "0" or get_position_info(new_position["x"] + 1, new_position["y"]) == "g":
			new_position["x"] += 1
			new_position["count"] += 1
			update_step_map_list(new_position)
		else:
			next_step = False
def check_move_left(now_position):
	next_step = True
	new_position = {
		"x": now_position["x"],
		"y": now_position["y"],
		"count": now_position["count"],
	}
	while next_step:
		if get_position_info(new_position["x"] - 1, new_position["y"]) == "0" or get_position_info(new_position["x"] - 1, new_position["y"]) == "g":
			new_position["x"] -= 1
			new_position["count"] += 1
			update_step_map_list(new_position)
		else:
			next_step = False
def check_move_top(now_position):
	next_step = True
	new_position = {
		"x": now_position["x"],
		"y": now_position["y"],
		"count": now_position["count"],
	}
	while next_step:
		if get_position_info(new_position["x"], new_position["y"] - 1) == "0" or get_position_info(new_position["x"], new_position["y"] - 1) == "g":
			new_position["y"] -= 1
			new_position["count"] += 1
			update_step_map_list(new_position)
		else:
			next_step = False
def check_move_bottom(now_position):
	next_step = True
	new_position = {
		"x": now_position["x"],
		"y": now_position["y"],
		"count": now_position["count"],
	}
	while next_step:
		if get_position_info(new_position["x"], new_position["y"] + 1) == "0" or get_position_info(new_position["x"], new_position["y"] + 1) == "g":
			new_position["y"] += 1
			new_position["count"] += 1
			update_step_map_list(new_position)
		else:
			next_step = False
def check_move_all(position):
	check_move_right(position)
	check_move_left(position)
	check_move_top(position)
	check_move_bottom(position)

s_x = s_place["x"]
s_y = s_place["y"]
initial_position = {
	"x": s_x,
	"y": s_y,
	"count": 0
}
update_step_map_list(initial_position)
check_move_all(initial_position)
def loop(count):
	is_continue = True
	while is_continue:
		prev_step_map_list = copy.deepcopy(step_map_list)
		for y_position, y_position_list in enumerate(step_map_list):
			for x_position, val in enumerate(y_position_list):
				if val and (int(val) > count):
					new_position = {
						"x": x_position,
						"y": y_position,
						"count": val
					}
					check_move_all(new_position)
		count += 1
		is_continue = False
		for index, s_list in enumerate(step_map_list):
			if set(s_list) == set(prev_step_map_list[index]):
				is_continue = False
			else:
				is_continue = True
				break
loop(0)
if step_map_list[g_place["y"]][g_place["x"]]:
	print(step_map_list[g_place["y"]][g_place["x"]])
else:
	print("Fail")
